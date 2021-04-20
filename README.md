### 升级 Selling Partner API 生成的客户端使用OkHttp3

默认使用的OkHttp是2.7.5版本太旧了，代理支持不好。

此项目从 https://github.com/amzn/selling-partner-api-models fork而来，升级okhttp3所修改的代码已经忽略不会被覆盖，具体见api-code/.swagger-codegen-ignore。
api-code为生成的代码，可以直接用maven命令打包。

    直接执行 ./start-codegen.sh 会重新生成客户端代码

    cd api-code
    mvn clean package

####  api-code pom.xml 修改如下
    
    <java.version>1.8</java.version>
    <dependency>
        <groupId>com.squareup.okhttp3</groupId>
        <artifactId>okhttp</artifactId>
        <version>3.14.9</version>
    </dependency>
    <dependency>
        <groupId>com.squareup.okhttp3</groupId>
        <artifactId>logging-interceptor</artifactId>
        <version>3.14.9</version>
    </dependency>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>1.18.8</version>
        <scope>provided</scope>
    </dependency>
    <dependency>
        <groupId>com.amazonaws</groupId>
        <artifactId>aws-java-sdk-signer</artifactId>
        <version>1.11.610</version>
    </dependency>
    <dependency>
        <groupId>com.amazonaws</groupId>
        <artifactId>aws-java-sdk-sts</artifactId>
        <version>1.11.236</version>
    </dependency>

