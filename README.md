```
mkdir -p /tmp/config/data
echo 'Hello World!' > /tmp/config/data/message

./mvnw clean package -DskipTests
java -jar target/demo-configdata-0.0.1-SNAPSHOT.jar
```

```
$ curl http://localhost:8080
Hello World!
```

```
$ curl http://localhost:8080/actuator/env
{"timestamp":"2020-10-22T10:12:30.527+00:00","status":500,"error":"Internal Server Error","message":"","path":"/actuator/env"}%                 (~)[lemon-admin@lemon] $ 
```

```
2020-10-22 19:12:51.767 ERROR 82004 --- [nio-8080-exec-6] o.a.c.c.C.[.[.[/].[dispatcherServlet]    : Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed; nested exception is org.springframework.http.converter.HttpMessageConversionException: Type definition error: [simple type, class sun.nio.ch.ChannelInputStream]; nested exception is com.fasterxml.jackson.databind.exc.InvalidDefinitionException: No serializer found for class sun.nio.ch.ChannelInputStream and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS) (through reference chain: org.springframework.boot.actuate.env.EnvironmentEndpoint$EnvironmentDescriptor["propertySources"]->java.util.ArrayList[4]->org.springframework.boot.actuate.env.EnvironmentEndpoint$PropertySourceDescriptor["properties"]->java.util.LinkedHashMap["data.message"]->org.springframework.boot.actuate.env.EnvironmentEndpoint$PropertyValueDescriptor["value"]->org.springframework.boot.env.ConfigTreePropertySource$PropertyFileContent["origin"]->org.springframework.boot.origin.TextResourceOrigin["resource"]->org.springframework.core.io.PathResource["inputStream"])] with root cause

com.fasterxml.jackson.databind.exc.InvalidDefinitionException: No serializer found for class sun.nio.ch.ChannelInputStream and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS) (through reference chain: org.springframework.boot.actuate.env.EnvironmentEndpoint$EnvironmentDescriptor["propertySources"]->java.util.ArrayList[4]->org.springframework.boot.actuate.env.EnvironmentEndpoint$PropertySourceDescriptor["properties"]->java.util.LinkedHashMap["data.message"]->org.springframework.boot.actuate.env.EnvironmentEndpoint$PropertyValueDescriptor["value"]->org.springframework.boot.env.ConfigTreePropertySource$PropertyFileContent["origin"]->org.springframework.boot.origin.TextResourceOrigin["resource"]->org.springframework.core.io.PathResource["inputStream"])
        at com.fasterxml.jackson.databind.exc.InvalidDefinitionException.from(InvalidDefinitionException.java:77) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.SerializerProvider.reportBadDefinition(SerializerProvider.java:1277) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.DatabindContext.reportBadDefinition(DatabindContext.java:400) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.impl.UnknownSerializer.failForEmpty(UnknownSerializer.java:71) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.impl.UnknownSerializer.serialize(UnknownSerializer.java:33) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsField(BeanPropertyWriter.java:728) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields(BeanSerializerBase.java:755) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.BeanSerializer.serialize(BeanSerializer.java:178) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsField(BeanPropertyWriter.java:728) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields(BeanSerializerBase.java:755) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.BeanSerializer.serialize(BeanSerializer.java:178) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsField(BeanPropertyWriter.java:728) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields(BeanSerializerBase.java:755) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.BeanSerializer.serialize(BeanSerializer.java:178) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsField(BeanPropertyWriter.java:728) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields(BeanSerializerBase.java:755) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.BeanSerializer.serialize(BeanSerializer.java:178) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.std.MapSerializer.serializeFieldsUsing(MapSerializer.java:821) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.std.MapSerializer.serializeWithoutTypeInfo(MapSerializer.java:679) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.std.MapSerializer.serialize(MapSerializer.java:637) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.std.MapSerializer.serialize(MapSerializer.java:33) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsField(BeanPropertyWriter.java:728) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields(BeanSerializerBase.java:755) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.BeanSerializer.serialize(BeanSerializer.java:178) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer.serializeContentsUsing(IndexedListSerializer.java:142) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer.serializeContents(IndexedListSerializer.java:88) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer.serialize(IndexedListSerializer.java:79) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer.serialize(IndexedListSerializer.java:18) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsField(BeanPropertyWriter.java:728) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields(BeanSerializerBase.java:755) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.BeanSerializer.serialize(BeanSerializer.java:178) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.DefaultSerializerProvider._serialize(DefaultSerializerProvider.java:480) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializeValue(DefaultSerializerProvider.java:319) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ObjectWriter$Prefetch.serialize(ObjectWriter.java:1516) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at com.fasterxml.jackson.databind.ObjectWriter.writeValue(ObjectWriter.java:1006) ~[jackson-databind-2.11.3.jar!/:2.11.3]
        at org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter.writeInternal(AbstractJackson2HttpMessageConverter.java:342) ~[spring-web-5.3.0-RC2.jar!/:5.3.0-RC2]
        at org.springframework.http.converter.AbstractGenericHttpMessageConverter.write(AbstractGenericHttpMessageConverter.java:104) ~[spring-web-5.3.0-RC2.jar!/:5.3.0-RC2]
        at org.springframework.web.servlet.mvc.method.annotation.AbstractMessageConverterMethodProcessor.writeWithMessageConverters(AbstractMessageConverterMethodProcessor.java:277) ~[spring-webmvc-5.3.0-RC2.jar!/:5.3.0-RC2]
        at org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor.handleReturnValue(RequestResponseBodyMethodProcessor.java:181) ~[spring-webmvc-5.3.0-RC2.jar!/:5.3.0-RC2]
        at org.springframework.web.method.support.HandlerMethodReturnValueHandlerComposite.handleReturnValue(HandlerMethodReturnValueHandlerComposite.java:78) ~[spring-web-5.3.0-RC2.jar!/:5.3.0-RC2]
        at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:124) ~[spring-webmvc-5.3.0-RC2.jar!/:5.3.0-RC2]
        at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:892) ~[spring-webmvc-5.3.0-RC2.jar!/:5.3.0-RC2]
        at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:806) ~[spring-webmvc-5.3.0-RC2.jar!/:5.3.0-RC2]
        at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87) ~[spring-webmvc-5.3.0-RC2.jar!/:5.3.0-RC2]
        at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1061) ~[spring-webmvc-5.3.0-RC2.jar!/:5.3.0-RC2]
        at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:961) ~[spring-webmvc-5.3.0-RC2.jar!/:5.3.0-RC2]
        at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006) ~[spring-webmvc-5.3.0-RC2.jar!/:5.3.0-RC2]
        at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898) ~[spring-webmvc-5.3.0-RC2.jar!/:5.3.0-RC2]
        at javax.servlet.http.HttpServlet.service(HttpServlet.java:626) ~[tomcat-embed-core-9.0.39.jar!/:4.0.FR]
        at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883) ~[spring-webmvc-5.3.0-RC2.jar!/:5.3.0-RC2]
        at javax.servlet.http.HttpServlet.service(HttpServlet.java:733) ~[tomcat-embed-core-9.0.39.jar!/:4.0.FR]
        at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:231) ~[tomcat-embed-core-9.0.39.jar!/:9.0.39]
        at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.39.jar!/:9.0.39]
        at org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:53) ~[tomcat-embed-websocket-9.0.39.jar!/:9.0.39]
        at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.39.jar!/:9.0.39]
        at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.39.jar!/:9.0.39]
        at org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100) ~[spring-web-5.3.0-RC2.jar!/:5.3.0-RC2]
        at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119) ~[spring-web-5.3.0-RC2.jar!/:5.3.0-RC2]
        at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.39.jar!/:9.0.39]
        at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.39.jar!/:9.0.39]
        at org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93) ~[spring-web-5.3.0-RC2.jar!/:5.3.0-RC2]
        at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119) ~[spring-web-5.3.0-RC2.jar!/:5.3.0-RC2]
        at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.39.jar!/:9.0.39]
        at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.39.jar!/:9.0.39]
        at org.springframework.boot.actuate.metrics.web.servlet.WebMvcMetricsFilter.doFilterInternal(WebMvcMetricsFilter.java:93) ~[spring-boot-actuator-2.4.0-SNAPSHOT.jar!/:2.4.0-SNAPSHOT]
        at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119) ~[spring-web-5.3.0-RC2.jar!/:5.3.0-RC2]
        at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.39.jar!/:9.0.39]
        at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.39.jar!/:9.0.39]
        at org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201) ~[spring-web-5.3.0-RC2.jar!/:5.3.0-RC2]
        at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119) ~[spring-web-5.3.0-RC2.jar!/:5.3.0-RC2]
        at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.39.jar!/:9.0.39]
        at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.39.jar!/:9.0.39]
        at org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:202) ~[tomcat-embed-core-9.0.39.jar!/:9.0.39]
        at org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:97) ~[tomcat-embed-core-9.0.39.jar!/:9.0.39]
        at org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:542) ~[tomcat-embed-core-9.0.39.jar!/:9.0.39]
        at org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:143) ~[tomcat-embed-core-9.0.39.jar!/:9.0.39]
        at org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:92) ~[tomcat-embed-core-9.0.39.jar!/:9.0.39]
        at org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:78) ~[tomcat-embed-core-9.0.39.jar!/:9.0.39]
        at org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:343) ~[tomcat-embed-core-9.0.39.jar!/:9.0.39]
        at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:374) ~[tomcat-embed-core-9.0.39.jar!/:9.0.39]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:65) ~[tomcat-embed-core-9.0.39.jar!/:9.0.39]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:868) ~[tomcat-embed-core-9.0.39.jar!/:9.0.39]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1590) ~[tomcat-embed-core-9.0.39.jar!/:9.0.39]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) ~[tomcat-embed-core-9.0.39.jar!/:9.0.39]
        at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1130) ~[na:na]
        at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:630) ~[na:na]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) ~[tomcat-embed-core-9.0.39.jar!/:9.0.39]
        at java.base/java.lang.Thread.run(Thread.java:832) ~[na:na]
```