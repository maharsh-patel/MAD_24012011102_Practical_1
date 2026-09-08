open class Person(
    var firstName: String,
    var lastName: String,
    var age: Int
) {
    constructor(
        firstName: String,
        lastName: String
    ) : this(
        firstName,
        lastName,
        18
    )
}

class Student(
    firstName: String,
    lastName: String,
    age: Int,
    var enrollmentNo: String,
    var branch: String,
    var className: String,
    var labBatch: String
) : Person(firstName, lastName, age) {

    constructor(
        firstName: String,
        lastName: String
    ) : this(
        firstName,
        lastName,
        18,
        "Not Assigned",
        "Not Assigned",
        "Not Assigned",
        "Not Assigned"
    )

    override fun toString(): String {
        return """
            Name          : $firstName $lastName
            Age           : $age
            Enrollment No : $enrollmentNo
            Branch        : $branch
            Class         : $className
            Lab Batch     : $labBatch
        """.trimIndent()
    }
}

fun main() {
    val students = listOf(
        Student(
            "Maharsh",
            "Patel",
            21,
            "24012011102",
            "Computer Engineering",
            "H",
            "1"
        ),
        Student(
            "Nihal",
            "Sharma",
            21,
            "EN002",
            "Electrical Engineering",
            "B",
            "2"
        ),
        Student(
            "Krush",
            "Patel",
            22,
            "EN003",
            "Mechanical Engineering",
            "B",
            "1"
        ),
        Student(
            "Zeel",
            "Patel",
            21,
            "EN004",
            "Civil Engineering",
            "A",
            "3"
        ),
        Student(
            "Shruti",
            "Thakkar",
            20,
            "EN005",
            "Information Technology",
            "C",
            "4"
        )
    )

    println("========================================")
    println("          STUDENT INFORMATION")
    println("========================================")

    students.forEachIndexed { index, student ->
        println("\nStudent ${index + 1}")
        println("----------------------------------------")
        println(student)
        println("----------------------------------------")
    }
}