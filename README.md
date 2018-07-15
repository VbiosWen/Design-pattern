
# Design-pattern
java设计模式学习以及个人理解
## 一.设计模式七大原则
### 1.单一性原则(SRP)
 单一性原则在我看来就是需要每个类各司其职，做好自己的工作。比如说UserDo类，就是存放用户的信息，与数据库字段进行映射DBConnection类,就是连接数据库，获取数据库连接。DBOperation类就是实现数据库的操作，执行sql语句。
### 2.开闭原则(OCP)
 开闭原则的定义为一个软件实体应该对扩展开放，对修改关闭。即软件实体应该尽量在不修改代码的情况下对外扩展。作用在一个功能上就是比如说一个动物群，里面有猴子，猪等，现在想知道这些东西都吃什么，通过定义一个抽象类。将动物的共同特点在抽象类定义,然后通过继承的方式，使得各个动物吃不同的食物。然后通过一个动物基类去获取这些动物，通过传入不同的对象，来获取动物吃的食物。
### 3.里氏代换原则(LCP)
 里氏代换原则定义为所有引用基类(父类)的地方必须能透明地使用其子类的对象。比如说需要给CommonCustomer和VIPCustomer发送邮件，而且二者发送邮件的方式相同，通过LCP定义我们可以使用基类包含需要发送邮件的所有属性，然后commonCustomer和VIPCustomer通过继承BaseCustomer的方式来继承父类的所有属性，在发送的时候只要将基类对象baseCustomer传给emailSender的send方法，就能实现给不同级别的人发送邮件。
### 4.依赖倒转原则(DIP)
 依赖倒转原则定义为抽象不应该依赖于细节，细节应该依赖于抽象。意思就是不应该针对实现编程，应该针对接口编程。依赖倒转原则要求尽量不要引用具体的实现类，而是通过实体类所对应的基类(抽象类),基于这个原则，就要避免在子类中定义和实现自己的方法，保证所有的方法和属性都在基类(抽象类)中定义，而子类则只需要实现基类中的抽象方法就行，这种方法能使系统具有很好的灵活性。这就要求我们在编码前需要进行需求分析，规划一下系统。
### 5.接口隔离原则(ISP)
 接口隔离原则定义为使用多个专门的接口，而不是使用一个单一的总接口。这就告诉我们需要在接口设计时将接口分为一个个小的接口，每一个接口承担一种相对独立的角色，划分规则有两种:1.角色隔离原则，2.定制服务。
### 6.合成复用原则(CRP)
 合成复用原则定义为尽量使用对象组合而不是继承来达到复用的目的。尽量使用对象组合而不是继承并不是说都用对象组合，我们在考虑合成复用原则的时候要根据对象之间的关系确定，如果对象之间是Has-A关系，则用对象组合，如果Is-A的关系，则采用继承的方式。继承一个非常大的缺点就是如果基类发生改变，子类的实现不得不发生改变，没有足够的灵活性。
### 7.迪米特法则
 迪米特法则的定义为一个软件实体应尽可能少地与其他实体发生相互作用。在此规则下，各个实体之间相互关联就很少了，能使系统遵循低耦合的规则。迪米特法则有一下几点规则，对于一个对象，其朋友包含一下几类:<br/>
   1.当前对象本身(this)<br/>
   2.以参数形式传入到当前方法中的对象<br/>
   3.当前对象的成员对象<br/>
   4.如果当前对象的成员对象是一个集合，那么集合内的元素也是他的朋友<br/>
   5.当前对象所创建的对象<br/>
## 二.六个创建型模式
 ### 1.简单工厂模式
  简单工厂模式不属于GOF23中设计模式，但是在软件开发应用中使用比较频繁。作为工厂模式的‘小弟’，我们有必要了解他。简单工厂模式包含以下角色:<br/>
  1.抽象产品角色(Product)<br/>
  2.具体产品角色(ConcreteProduct)<br/>
  3.工厂角色(Factory)<br/>
  具体模型如下:<br/>
  ![简单工厂模式模型图](http://www.plantuml.com/plantuml/png/SoWkIImgAStDuGh9BCb9LL1wlgxXQU_KfzkNFkrhUhPYuTCz_SytxdxQkldvvjrFP-zJuafCAYufIamkKGWeoayfJIxXWj8ADZMwkWhE-Nd9HQabgL11GxooHbnkG8FoYoeLRFJqCBGYIsBgHBWZEIUnk5W1PayrbxP2GMbIJcQoGbb-Pef2IcPnGKvYfOQcDLSj5rWfXaLaw34YHW_C_GYbS5S2pKg46mRHuv2QbmAC1W00)<br/>
  优点:简单工厂方法将创建产品的细节隐藏，通过对工厂类传入一个参数，就能根据参数创建对应的产品。使得系统的扩展性很好，如果要加入一个新的产品，只要继承抽象产品角色，并在工厂类中设置参数，就可以了。
  实现了对象的使用和创建的分离，通过引入配置文件，可以帮助我们在不修改任何代码的情况下获取到不同的产品<br/>
  缺点:因为每次新增一个产品就需要修改工厂角色的代码，所以不符合开闭原则。由于工厂类集合了所有的产品的创建过程，一旦工厂类无法使用，则整个系统就不能使用，工厂类与产品类的耦合度太高。<br/>
  ### 2.工厂模式
  在简单工厂模式中，因为只有一个工厂类，导致整个系统的耦合度非常高，因此工厂模式就是为了解决这个问题。<br/>
  在工厂模式中，通过定义一个抽象的工厂类，通过对产品进行分类，提供给不同的工厂类进行生产。<br/>
  工厂模式主要包括以下角色:<br/>
  1.抽象工厂角色(abstract factory)<br/>
  2.具体工厂角色(factory)<br/>
  3.抽象产品角色(abstract product)<br/>
  4.具体产品角色(product)<br/>
  模型图为:<br/>
  ![工厂模式模型图](http://www.plantuml.com/plantuml/png/SoWkIImgAStDuGh9BCb9LNYwVUdJlgPdAnO-tTFFbPXKN5AKc5oYa9oJM5oi452KdrAQN88kx0PavXTLSd4vv-Sb5wMMf4BL6IhewTafe0l2LAE96s5JR0HJZCCb2jLSsWe5fKavcSaAS1Lb-Paf2YcPnGKvYPKQcjPSjLmGFHYkIwqeISrBWHk6C8jO8un8CG97g67n0TntGBiIuPRXymhKB9XpCCt6PQGLq9JIeZo5lDHo34Dn-feMjXa1RNC0cWPCY000)<br/>
  优点：<br/>
  1.工厂模式中，用来生产具体产品的细节被隐藏，用户只需要关心产品所对应的工厂就行了，不需要关心具体细节，甚至不需要知道具体产品类的类名。<br/>
  2.由于工厂和产品的多态性，可以让工厂自主确定生产何种产品，而且生产产品的具体细节隐藏在工厂内部。工厂模式又称为多态工厂模式，就正是因为所有的具体工厂类都具有同一个抽象的父类。<br/>
  3.在加入新产品的情况下，无需修改工厂类，只要添加具体的产品类以及工厂类就能实现了，这样系统的扩展性就很好了，完全符合“开闭原则”。<br/>
  缺点:<br/>
  1.在添加新产品的时候，不仅要添加新的产品类，还要添加具体的产品工厂类，类的个数成对增加，加大了系统的复杂度，增加了系统的开销。<br/>
  2.由于考虑到系统的扩展性，需要引入抽象层，在客户端代码中均使用抽象层定义，增加了系统的抽象度和理解难度。在实现中，还需要使用反射，DOM等手段，增加了系统的实现难度。
 ### 3.抽象工厂模式
  在工厂模式中，因为每一个产品就对应一个工厂类，导致了系统很大的开销，所以我们考虑使用抽象的思想，将产品进行分类，然后建立产品组的工厂，这样就节省了很多工厂类的开销。<br/>
  抽象工厂模式主要包括以下角色：<br/>
  1.抽象工厂角色(将工厂分类考虑)<br/>
  2.具体工厂角色<br/>
  3.抽象产品角色<br/>
  4.具体产品角色<br/>
  模型图为:<br/>
  ![抽象工厂模式模型图](http://www.plantuml.com/plantuml/png/SoWkIImgAStDuGh9BCb9LNZMjVV5neLFjozzsjVqRCN2ftlwkHAJYakA4fDB599p4ekB5HoXt82Y_9JIv1B7QYw5ilpC58NYZFno3KskMWBgdJ3KSq7KmSmpL4YjA4dDIy6qYP1E8t9rEk6qqucGJYCIT6RcbQGMfIKcfogu0TNb5rK2bIGNfIQMfCBSgQ5fXUvqD2LEc4gS4Avopiy3geOhXbfZg92PMv2JcfkQLr9CPwkDQ6er8idewTdXyZmNJ0DHgXoDyAWoWfk5NvK3C440inG0)<br/>
  优点:抽象工厂模式相对于工厂模式，减少了工厂类的创建，通过将一个产品组的组成一个工厂类，减少每个小的零件都需要建立一个工厂的方式，大大减少了工厂类的创建。同时，抽象工厂模式在横向方向具有很好的扩展性，比如说我们需要新增加一个产品组，只需要实现抽象工厂类和抽象产品类就行了。<br/>
  缺点:在抽象工厂模式中如果我们需要在纵向加入了一个组件，比如在例子中我们可能需要新增一个输入框，这个时候我们就要修改抽象工厂，这就违背了设计模式的开闭原则，同时我们还需要修改每一个具体的工厂类，编码工作非常大，这样也就不符合设计模式的初衷了。所以在系统开发前，做好软件项目的设计非常重要。<br/>
 ### 4.单例模式
  单例模式:在单例类的内部实现只生成一个实例，同时它提供一个静态的getInstance()工厂方法，让客户可以访问单一的一个实例；为了防止在外部对其实例化，需要将构造函数设计为私有函数，其内部提供一个singleton的静态对象，作为外部共享的唯一实例。<br/>
  模型图：<br/>
  ![单例模式模型图](http://www.plantuml.com/plantuml/png/SoWkIImgAStDuV99hAeCpinBpqajoSzJqDNDLq0LiShC0whDIqxbIiv9B2v6bRMnWJFjxAgv57GLge6AIpAJQr4DoK7csUQLvkHOWnIZADBG18ffAnIKvcGcmurHWD1eRifBBVU4kWgagvRB8JKl1UWP0000)<br/>
  单例模式适应情景:单例模式作为结构最简单的设计模式，在很多地方都有非常大的用处。比如说web框架常用的spring框架，其里面的bean生成方式默认就为单例模式，这样既节省了系统资源又能够提高效率。<br/>
  单例模式分为饱汉模式，懒汉模式和IoDH模式，饱汉模式是在jvm加载类的时候就会创建实例对象，优点是不用考虑线程安全问题，缺点是当前单例未使用情况下依然会占据系统资源。懒汉模式则是在需要的时候创建，但是在多线程情况下会出现创建多个实例对象的问题，解决办法是对创建过程加锁，虽然节省了资源，但是因为在线程创建时加锁，会导致系统性能下降很多，所以也不推荐使用。IoDH模式是使用java的代码特性，通过静态内部类的方式进行创建，因为静态内部类是在调用的使用才会编译，所以不用担心资源问题。同时jvm在加载类的时候又保证了线程安全，所以不用考虑会创建多个实例，是目前单例模式最好的解决办法。<br/>













