Email Microservice - [EMAIL]

<p align="center"> 
  <a href="https://spring.io/" target="_blank">
    <img width="80%" src="https://res.cloudinary.com/practicaldev/image/fetch/s--wRMdL8Hi--/c_imagga_scale,f_auto,fl_progressive,h_900,q_auto,w_1600/https://dev-to-uploads.s3.amazonaws.com/i/5wv3jwohdhckevgdejku.png"/>
  </a> 
</p>

<h4 align="center" >🚀 🟧 Email Microservice 🟧 🚀</h4>

<h4 align="center">
  Email Microservice of an Email Messenger System based on <a href="https://www.youtube.com/@MichelliBrito" target="_blank" >@MichelliBrito</a>'s classes 
</h4>

<p align="center">
  |&nbsp;&nbsp;
  <a style="color: #8a4af3;" href="#project">Overview</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a style="color: #8a4af3;" href="#techs">Technologies</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a style="color: #8a4af3;" href="#app">Project</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;
  <a style="color: #8a4af3;" href="#routes">Routes</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a style="color: #8a4af3;" href="#run-project">Run</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;
  <a style="color: #8a4af3;" href="#author">Author</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
</p>

#

<h1 align="center">

  <a href="https://github.com/Samuel-Ricardo">
    <img src="https://img.shields.io/static/v1?label=&message=Samuel%20Ricardo&color=black&style=for-the-badge&logo=GITHUB"/>
  </a>

  <a herf="https://www.instagram.com/samuel_ricardo.ex/">
    <img src='https://img.shields.io/static/v1?label=&message=Samuel.ex&color=black&style=for-the-badge&logo=instagram'/> 
  </a>

  <a herf='https://www.linkedin.com/in/samuel-ricardo/'>
    <img src='https://img.shields.io/static/v1?label=&message=Samuel%20Ricardo&color=black&style=for-the-badge&logo=LinkedIn'/> 
  </a>

</h1>

<br>

<p id="project"/>

<h2> | 🛰️ About:  </h2>

<p align="justfy">
    This application is an implementation of a Microservices Architecture using RabbitMQ for queue communication and the best practices of Clean Architecture, SOLID and DDD, all documented. Use Docker to handle the entire system structure.
</p>

:octocat: | User Microservice: [ https://github.com/Samuel-Ricardo/ems_user ]

<br>

<h2 id="techs">
| 🏗️ - Technologies and Concepts Studied:
</h2>

> <a href='https://spring.io/'> <img width="40px" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" /> </a>

<br>

- Spring Framework
- RabbitMQ
- PostgreSQL
- Docker
- Microservice
- Communication Between Microservices
- Email SMTP
- Maven
- REST
- Swagger
- Validation
- Lombok
- Environment
- Clean Architeture
- DDD
- JUnit
- H2 Database
- Error Handler

> Among Others...
<br>

#

<h2 id="app">
  💻 | Application:
</h2>

<img src="https://github.com/Samuel-Ricardo/ems_user/raw/main/READEME_FILES/preview_arch.png"/>

<br>

<p>
    Giving an overview, this architecture is divided into User Microservice and Email Microservice, each with its own databases, communication between them occurs through a broker which in this case is based on asynchronous queues managed by RabbitMQ
</p>

<br>

<h3> 🕺 | User </h3>

:shipit: | Repository: [ https://github.com/Samuel-Ricardo/ems_user ]

<br>

  <p>
    The main function of User Microservice is to list and register users in a database. When a user is saved in this MS, it publishes this event to the broker.
  </p>

 <br>

<h3> 📧 | Email </h3>

:shipit: | Repository: [ https://github.com/Samuel-Ricardo/ems_email ]

  <br>

  <p>
    The main function of the Email Microservice is to send a welcome email to new users, for this it listens to the broker, when a created user event is published this MS consumes this event and sends an email to this new created user welcoming . 
  </p>

 <br>

<h3> 📮 | Broker </h3>

<img src="https://github.com/Samuel-Ricardo/ems_user/raw/main/READEME_FILES/broker.png"/>

<p>
  The broker is an intermediary between microservices, it receives events and store in a Queue Data Structure that is triggered and can be consumed by other microservices that are waiting for it to react.
</p>

