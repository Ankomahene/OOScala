package io.turntabl.oopscala

import io.turntabl.students.{TLCStudent, TurntablManager}

object MyApp extends App {
    val me  = new TLCStudent("Shadrack", "Ankomahene", 2, "Software Engineer", 2016, "ttps://github.com/ankomahene");
    val another = new TLCStudent("Isaac", "Afram", 1, "Software Engineer", 2018);

    println(me termsOfService(), "Years")
    println(me isSameTermOfService  another)

    println(me TopGrade("Java", 99.0));

    def howHardTurntablEmployeeWorks(employee: TurntablManager) = employee.GetWorkload
    val sam = new TurntablManager

    println(howHardTurntablEmployeeWorks(sam))

















    println(""" """)
    println(""" """)
    println(""" """)
    println(""" """)
    println(""" """)
    println(""" """)
}