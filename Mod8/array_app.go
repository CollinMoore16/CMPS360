package main

import "fmt"

func main() {
	const conferenceTickets int = 50
	var remainingTickets uint = 50
	conferenceName := "Bison Up Conference"
	bookings := []string{}

	fmt.Println("Welcome to" + conferenceName + " booking application. \n We have a total of %v are still available. \n Get your tickets here to attend\n ")

	//Declare Data types
	var firstName string
	var lastName string
	var email string
	var userTickets uint

	//Collect the data
	fmt.Println("Enter your First Name: ")
	fmt.Scanln(&firstName)

	fmt.Println("Enter your Last Name: ")
	fmt.Scanln(&lastName)

	fmt.Println("Enter your Email: ")
	fmt.Scanln(&email)

	fmt.Println("Enter number of tickets: ")
	fmt.Scanln(&userTickets)

	//Logic for booking system
	remainingTickets = remainingTickets - userTickets
	bookings = append(bookings, firstName+" "+lastName)

	//Output
	fmt.Printf("Thank you %v %v for booking %v tickets. you will recieve a confirmation email at %v \n", firstName, lastName, userTickets, email, remainingTickets, conferenceName, bookings)

	fmt.Printf("%v tickets remaning for %v \n", remainingTickets, conferenceName)
	fmt.Printf("These are all of our bookings: %v\n", bookings)

}
