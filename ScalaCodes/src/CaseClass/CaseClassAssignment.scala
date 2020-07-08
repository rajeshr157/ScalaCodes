package CaseClass

import javax.management.Notification

object CaseClassAssignment {

  def main(args: Array[String]): Unit = {

    val email1 = Email("Rajesh", "Test Email 1", "Hello Rajesh")
    val email2 = Email("Ramesh", "Greetings", "Good Morning")

    val sms1 = SMS("Sam", "Welcome to Bengaluru")
    val sms2 = SMS("Joy", "Thank you for visiting")

    val voice1 = VoiceRecording("James", "Test link 1")
    val voice2 = VoiceRecording("Ram", "Test Link 2")

    val impemail = Email("Rajesh", "Test email through imp", "Email Success")
    val impsms = SMS("12345", "Test sms through imp successful")
    val impvoice = VoiceRecording("Sankir voice", "Test voice link 4 ")

    val importantpeople = Seq("12345", "Rajesh", "Ramesh")

    println()
    println(email1)
    println(sms1)
    println(voice1)
    println()
    println(showImportantNotification(impemail, importantpeople))
    println(showImportantNotification(impsms, importantpeople))
    println(showImportantNotification(impvoice, importantpeople))
  }

  def showNotification(notification: Notification): String = {
    notification match {
      case Email(sender, title, _) =>
        s"You have an email from $sender with title: $title"
      case SMS (caller, message) =>
        s"You have an sms from $caller, Message: $message"
      case  VoiceRecording (contactName, link) =>
        s"You received a voice recording from $contactName, the link is $link"
    }

  }

  def showImportantNotification(notification: Notification, impPersonList: Seq[String]): String = notification match{
    case Email(sender,_,_ ) if impPersonList.contains(sender) =>
      "You've got an email from special someone"
    case SMS(caller,message) if impPersonList.contains(caller) =>
      "You've got an SMS from special someone"
    case other =>
      showNotification(other)
  }
}
