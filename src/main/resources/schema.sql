
-- table students
create table if not exists students(
    student_id serial primary key,
    student_name varchar(200) not null ,
    student_email varchar(200),
    student_phone_number varchar(10)
    );


-- table instructors
create table if not exists instructors(
    instructor_id serial primary key ,
    instructor_name varchar(300) not null ,
    instructor_email varchar(200) not null
    );


-- table courses
create table if not exists courses(
    course_id serial primary key ,
    course_name varchar(200) not null ,
    course_description varchar(500) not null,
    instructor_id int not null,
    constraint fk_instructor foreign key (instructor_id) references instructors (instructor_id) on delete cascade on update cascade
    );


-- table student course
create table if not exists student_course(
    student_course_id serial primary key,
    student_id int not null ,
    course_id int not null,
    CONSTRAINT fk_student FOREIGN KEY (student_id) REFERENCES students (student_id) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT fk_course FOREIGN KEY (course_id) REFERENCES courses (course_id) ON DELETE CASCADE ON UPDATE CASCADE

    );
