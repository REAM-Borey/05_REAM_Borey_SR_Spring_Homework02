select * from students;

insert into students(student_name,student_email,student_phone_number) values
    ('Heng Sokleap','Sokleap@gmail.com','0887171383'),
    ('Nop Relaxsun','Relaxsun@gmail.com','0889090999');



select * from instructors;


insert into instructors(instructor_name,instructor_email) values
  ('Sovannak','Sovannak168@gmail.com'),
  ('Rotanakkosal','Rotanakkosal@gmail.com');

insert into courses(course_name,course_description,instructor_id) values
    ('Spring','Spring makes building web applications fast and hassle-free. By removing much of the boilerplate code and configuration associated with web development, you get a modern web programming model that streamlines the development of server-side HTML applications, REST APIs, and bidirectional, event-based systems.',1),
    ('Website','A website (also written as a web site) is any web page whose content is identified by a common domain name and is published on at least one web server. Websites are typically dedicated to a particular topic or purpose, such as news, education, commerce, entertainment, or social media. Hyperlinking between web pages guides the navigation of the site, which often starts with a home page. The most-visited sites are Google, YouTube, and Facebook.',2);

select * from courses;

insert into student_course(student_id,course_id) values
     (1,1),
    (2,2);


