# Evansky Demo Project

一个简单的Java示例项目，演示基本的Java应用程序结构和Maven项目配置。

## 项目结构

```
src/main/java/com/evansky/demo/  - Java源代码
src/test/java/com/evansky/demo/  - 单元测试
```

## 功能

- 基本的控制台应用程序
- 提供简单的问候功能
- 基本的计算器功能（加、减、乘、除）

## 构建与运行

### 先决条件

- JDK 8 或更高版本
- Maven 3.6.0 或更高版本

### 构建项目

```bash
mvn clean package
```

### 运行应用程序

```bash
java -jar target/demo-1.0-SNAPSHOT.jar
```

### 运行测试

```bash
mvn test
```

## 许可证

MIT