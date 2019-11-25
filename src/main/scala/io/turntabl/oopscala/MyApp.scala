package io.turntabl.oopscala

import io.turntabl.students.TLCStudent

object MyApp extends App {
    val me  = new TLCStudent("Shadrack", "Ankomahene", 2, "Software Engineer", 2016, "ttps://github.com/ankomahene");
    val another = new TLCStudent("Isaac", "Afram", 1, "Software Engineer", 2018);

    println(me yearsWithTurntabl(), "Years")
    println(me isSameTermOfService  another)

    print(me TopGrade("Java", 99.0));
}