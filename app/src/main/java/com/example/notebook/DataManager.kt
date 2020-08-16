package com.example.notebook

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intent", "Android Programming with Intents")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "android_async", title = "Android Async Programming and Services")
        courses.set(course.courseId, course)

        course = CourseInfo(title = "Java Fundamentals: The Java Language", courseId = "java_lang")
        courses.set(course.courseId, course)

        course = CourseInfo("java_core", "Java Fundamentals: The Core Platform")
        courses.set(course.courseId, course)
    }

    private fun initializeNotes() {
        var course = courses["android_intent"]!!
        var note = NoteInfo(course, "Dynamic intent resolution",
            "Wow, intents allow components to be resolved at runtime")
        notes.add(note)

        course = courses["android_async"]!!
        note = NoteInfo(course, "2nd Note",
            "2nd Note Text")
        notes.add(note)

        course = courses["java_lang"]!!
        note = NoteInfo(course, "3rd Note",
            "3rd Note Text")
        notes.add(note)

        course = courses["java_core"]!!
        note = NoteInfo(course, "4th Note",
            "4th Note Text")
        notes.add(note)
    }

}