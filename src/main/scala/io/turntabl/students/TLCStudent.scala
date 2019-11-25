package io.turntabl.students

import java.time.Year

import io.turntabl.grades.Grade

class TLCStudent(
                  val firstName: String,
                  val secondName: String,
                  val ID: Int = 0,
                  val role: String = "developer",
                  year: Int = 2019,
                  val githubURL: String = "https://github.com/turntabl"
                )
{

  override def toString: String = s"Name: $firstName  $secondName ID: $ID Role Description: $role GITHUB: $githubURL"

  def  yearsWithTurntabl() = Year.now().getValue - year

  def isSameTermOfService(s: TLCStudent) = yearsWithTurntabl() == s.yearsWithTurntabl()

  def TopGrade(subject : String, grade : Double) = Grade(subject, grade)

}

object TLCStudent{
  def apply(firstName: String, secondName: String, ID: Int, role: String, year: Int, githubURL: String) = new TLCStudent(firstName, secondName, ID, role, year, githubURL)
}




