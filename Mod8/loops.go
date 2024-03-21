package main

import "fmt"

func main() {

	//infinite loop
	/*
		i := 99

		for {
			fmt.Println(i)
			i += 1
		}
	*/

	//loop will break now
	i := 5

	for i < 10 {
		fmt.Println(i)
		i++
	}

}
