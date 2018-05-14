常规容器下SpringBootServletInitializer如何实现web.xml作用解析
https://blog.csdn.net/songhaifengshuaige/article/details/54138023

关于自定义的ServletContainerInitializer扫描问题

一开始由于我理解上的错误，我在web项目的META-INF/services/ 目录下放置 javax.servlet.ServletContainerInitializer文件，其实这样是不会被
Servlet容器扫描到。
正确的做法是要建立一个JAR包，然后在Jar包的META-INF/services目录放置这个文件。然后再将这个jar包放置入web项目的 WEB-INF/lib目录下。

机构如下

Web project root 
    WEB-INF
        lib
            com.yourcompany.libname.version.jar
                META-INF
                    services
                        javax.servlet.ServletContainerInitializer
                        
                        
如果用Intellij IDEA 的Gradle 来构建项目的话, 那么对应的Jar包应该作为单独的一个模块，然后通过Project Struct设置中的artifacts来打包为JAR