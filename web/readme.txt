<!--
@WebServlet 注解

name = "TestServlet"
-->
<servlet>
    <servlet-name>TestServlet</servlet-name>
    <servlet-class>com.java1823.TestServlet</servlet-class>
    <!--
    initParams = {
            @WebInitParam(name = "test", value = "test")
    }
    -->
    <init-param>
        <param-name></param-name>
        <param-value></param-value>
    </init-param>
    <!--
    loadOnStartup = 1
    -->
    <load-on-startup></load-on-startup>
</servlet>
<!--
urlPatterns = "/test"
-->
<servlet-mapping>
    <servlet-name>TestServlet</servlet-name>
    <url-pattern>/test</url-pattern>
</servlet-mapping>