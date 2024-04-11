from newspaper import Article
from textblob import TextBlob

def get_article_sentiment(url):
    article = Article(url)
    
    # Download and parse the article
    article.download()
    article.parse()
    
    # Extract the article text
    article_text = article.text
    
    # Perform sentiment analysis on the article text
    sentiment = analyze_sentiment(article_text)
    
    return sentiment

def analyze_sentiment(text):
    # Define positive and negative keywords
    positive_keywords = ["celebrate", "Celebrate", "celebrating", "Celebrating", "happy", "Happy", "joy", "Joy", "joyous", "Joyous", "great", "Great", "excellent",
                          "Excellent", "good", "Good", "revolution", "Revolution", "birthday", "Birthday"]
    negative_keywords = ["sad", "Sad", "saddening", "Saddening", "grief", "Grief", "mourning", "Mourning", "mourn", "Mourn", "loss", "Loss", "tragic", "Tragic",
                          "death", "Death", "bad", "Bad", "fallen", "Fallen", "killed", "Killed"]
    
def analyze_sentiment(text):
    # Define positive and negative keywords with weights
    keywords = {
        "positive": {
            "celebrate": 2,
            "Celebrate": 2,
            "celebrating": 2,
            "Celebrating": 2,
            "happy": 1,
            "Happy": 1,
            "joy": 2,
            "Joy": 2,
            "joyous": 2,
            "Joyous": 2,
            "great": 4,
            "Great": 4,
            "excellent": 5,
            "Excellent": 5,
            "good": 2,
            "Good": 2,
            "revolution": 5,
            "Revolution": 5,
            "birthday": 2,
            "Birthday": 2,
        },
        "negative": {
            "sad": 1,
            "Sad": 1,
            "grief": 2,
            "Grief": 2,
            "mourning": 3,
            "Mourning": 3,
            "mourn": 3,
            "Mourn": 3,
            "loss": 3,
            "Loss": 3,
            "death": 5,
            "Death": 5,
            "bad": 1,
            "Bad": 1,
            "fallen": 2,
            "Fallen": 2,
            "killed": 5,
            "Killed": 5
        }
    }
    
    # Initialize sentiment scores
    positive_score = 0
    negative_score = 0
    
    # Count occurrences of positive and negative keywords
    for word in text.lower().split():
        for keyword, weight in keywords["positive"].items():
            if word == keyword:
                positive_score += weight
        for keyword, weight in keywords["negative"].items():
            if word == keyword:
                negative_score += weight
    
    # Determine overall sentiment based on scores
    if positive_score > negative_score:
        return "Positive"
    elif positive_score < negative_score:
        return "Negative"
    else:
        return "Neutral"


# Get the URL of the article from the user
url = input("Enter the URL of the article: ")

# Get the sentiment of the article
article_sentiment = get_article_sentiment(url)

# Display the sentiment
print("Sentiment of the article:", article_sentiment)
