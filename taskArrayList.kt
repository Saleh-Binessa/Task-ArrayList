fun main() {
    // Step 1: Create an ArrayList
    val numberList = ArrayList<Int>()

    // Step 2: Add Elements
    numberList.add(10)
    numberList.add(20)
    numberList.add(30)
    numberList.add(40)
    numberList.add(50)

    // Step 3: Update an Element
    val indexOfElementToUpdate = 2 // Index 2 corresponds to the third element
    val newElementValue = 35
    if (indexOfElementToUpdate in 0 until numberList.size) {
        numberList[indexOfElementToUpdate] = newElementValue
    } else {
        println("Invalid index for updating an element.")
    }

    // Step 4: Remove an Element
    if (numberList.isNotEmpty()) {
        numberList.removeAt(0) // Remove the first element
    } else {
        println("The list is empty. Cannot remove an element.")
    }

    // Step 5: Print the Final List
    println("Final List:")
    for (number in numberList) {
        println(number)
    }
}