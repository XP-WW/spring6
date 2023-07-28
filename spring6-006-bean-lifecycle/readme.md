## Spring容器只对singleton的Bean进行完整的生命周期管理

#### Bean生命周期五步：
* 第一步，无参数构造方法执行
* 第二步：给对象的属性赋值。
* 第三步：初始化Bean
* 第四步：使用Beancom.xp.spring6.User@22555ebf
* 第五步：销毁Bean

#### Bean生命周期七步
* 第一步，无参数构造方法执行
* 第二步：给对象的属性赋值。
* 第三步：执行“Bean后处理器”的Before方法
* 第四步：初始化Bean
* 第五步：执行“Bean后处理器”的after方法
* 第六步：使用Beancom.xp.spring6.User@22555ebf
* 第七步：销毁Bean

#### Bean生命周期十步
* 执行“Bean后处理器”的Before方法之前
  * 检查Bean是否实现了Aware相关的接口（BeanNameAware, BeanClassLoaderAware, BeanFactoryAware）
  如果实现了这些接口，则spring容器会调用这个接口的方法
* 执行“Bean后处理器”的Before方法之后
  * 检查Bean是否实现了InitializingBean接口，如果实现了，则调用
* 执行Bean之前，或者说销毁Bean之后
  * 检查Bean是否实现了DisposableBean接口，如果实现了，则调用