import requests 
from bs4 import BeautifulSoup
import json

def scrape_live_page(url):
    response = requests.get(url)

    if response.status_code == 200:
        soup = BeautifulSoup(response.content, 'html.parser')
        
        # Scraping logic here
        job_listings = []
        for job in soup.find_all(class_='job'):
            job_title = job.find('h2').get_text()
            job_description = job.find_all('p')[1].get_text() if len(job.find_all('p')) > 1 else ''
            job_location = job.find_all('p')[2].get_text() if len(job.find_all('p')) > 2 else ''
            job_salary = job.find_all('p')[3].get_text() if len(job.find_all('p')) > 3 else ''
            
            job_data = {
                'title': job_title,
                'description': job_description,
                'location': job_location,
                'salary': job_salary
            }
            job_listings.append(job_data)

        # Save scraped data to output.json
        with open('output.json', 'w') as f:
            json.dump(job_listings, f, indent=4)
        print("JSON response saved to output.json")
    else:
        print(f"Error: {response.status_code}")

if __name__ == "__main__":
    url = "http://127.0.0.1:5500/page.html"  # Replace with the actual URL
    scrape_live_page(url)
