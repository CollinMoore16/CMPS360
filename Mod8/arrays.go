package main

import "fmt"

func main() {
	var arr [3]string
	// [] [] [] [] <---- elements
	// 0  1  2  3  <---- index values 0,1,2,3...
	fmt.Println(arr)

	arr = [3]string{"Coffee", "Espresso", "Cappuccino"}
	fmt.Println(arr)

	fmt.Println(arr[2]) //outputs postition 2 = Cappuccino
	arr[2] = "Latte"    // just like pop and shift from JS arrays

	fmt.Println(arr)
}
