package core.example.kotlin

import org.springframework.context.support.ClassPathXmlApplicationContext

fun main(){
    val context = ClassPathXmlApplicationContext("kotlin/config.xml")
    val  simpleMovieLister = context.getBean("simpleMovieLister", SimpleMovieLister::class)
    System.out.println(simpleMovieLister)

}