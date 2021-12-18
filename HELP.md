# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.1/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.1/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.6.1/reference/htmlsingle/#using-boot-devtools)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.6.1/reference/htmlsingle/#boot-features-spring-mvc-template-engines)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.1/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)


### 경수

GIT 연동
 GIT ID/TOKEN 연동해야함
   EX) kyungsu77777@naver.com / github.com 에서 생성한 토큰

IDE : STS 설치 필요

빌드 시 NPM 설치 필요 : node js


cd src\main\webapps
npm install vue
npm install -g @vue/cli
vue create <projectName>

webpack 
 - 여러가지 소스 파일을(js,css,sass,jmx? 등 다양한) 하나의 js 파일로 번들화(모듈화) 하여 html 파일에서 import 할 수 있게 해줌.
 - style-loader, css-loader, babel(브라우져 호환성을 보장해주는 opensource ex. es2016 -> es2015 하위 호환 가능 하게끔)
   등을 적용하여 모듈을 생성할 수 있도록 도와줌
 - require () 에 로더를 지정할 수 있지만, webpack-config 파일을 통해 자동화 할 수 있음

webpack dev server
 - localhost:8080(포트 변경 가능) 서버를 띄울 수 있게 도와줌. (webpack 모듈화 적용하여).
 - vue/cli-service 는 webpack dev server 위에서 돈다



