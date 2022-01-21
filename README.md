# Spring-Boot-Neo4j-Movies

### Spring-Boot集成Neo4j结合Spark的朴素贝叶斯分类器实现基于电影知识图谱的智能问答系统

## 博客地址：https://blog.csdn.net/appleyk

## 项目博客地址：https://blog.csdn.net/Appleyk/article/details/80422055


#### 升级Spark依赖，由原来的2.3升级到2.4，GitHub官方提醒> = 1.0.0，<= 2.3.2之间的版本容易受到攻击
#### spark2.4  == >scala2.11 and scala2.12


```text

<!-- https://mvnrepository.com/artifact/org.apache.spark/spark-core -->
<dependency>
	<groupId>org.apache.spark</groupId>
	<artifactId>spark-core_2.12</artifactId>
	<version>2.4.0</version>
	<exclusions>
		<exclusion>
			<groupId>org.slf4j</groupId>
			<artifactId>slf4j-log4j12</artifactId>
		</exclusion>
	</exclusions>
</dependency>
<!-- https://mvnrepository.com/artifact/org.apache.spark/spark-mllib -->
<dependency>
	<groupId>org.apache.spark</groupId>
	<artifactId>spark-mllib_2.12</artifactId>
	<version>2.4.0</version>
</dependency>


```



#### 如果down下来的demo在本地无法运行，请自行降低版本，保证本地spark环境的版本号和pom中的spark依赖的jar包版本一致！


### 运行图例：<br><br>

![效果展示](https://i.postimg.cc/YSpGPQmD/res.png)
<br><br>
![效果展示](https://i.postimg.cc/g0DRcgWP/res-1.png)
<br><br>
![效果展示](https://i.postimg.cc/T2y9QXxL/res-2.png)
<br><br>
![效果展示](https://i.postimg.cc/DwhP2JXL/res-3.png)
<br><br>
![效果展示](https://i.postimg.cc/nLcKDyTL/res-4.png)
<br><br>
![效果展示](https://i.postimg.cc/PxCm61gs/custom.png)
