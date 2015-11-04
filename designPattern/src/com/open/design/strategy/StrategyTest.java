package com.open.design.strategy;

import com.open.design.strategy.AbsRole.Knight;
import com.open.design.strategy.IWeapon.*;

/*
 * 
1.策略模式，又叫算法簇模式，就是定义了不同的算法族，并且之间可以互相替换，此模式让算法的变化独立于使用算法的客户

2.这个模式涉及到三个角色：

●　　环境(Context)角色：持有一个Strategy的引用。

●　　抽象策略(Strategy)角色：这是一个抽象角色，通常由一个接口或抽象类实现。此角色给出所有的具体策略类所需的接口。

●　　具体策略(ConcreteStrategy)角色：包装了相关的算法或行为。

3，设计原则
  
     设计原则是把一个类中经常改变或者将来可能改变的部分提取出来，作为一个接口（c++z中可以用虚类），然后在类中包含这个对象的实例，这样类的实例在运行时就可以随意调用实现了这个接口的类的行为。下面是一个例子。 

      策略模式属于对象行为型模式，主要针对一组算法，将每一个算法封装到具有共同接口的独立的类中，从而使得它们可以相互替换。策略模式使得算法可以在不影响 到客户端的情况下发生变化。通常，策略模式适用于当一个应用程序需要实现一种特定的服务或者功能，而且该程序有多种实现方式时使用。

4.策略模式的优点
　　（1）策略模式提供了管理相关的算法族的办法。策略类的等级结构定义了一个算法或行为族。恰当使用继承可以把公共的代码移到父类里面，从而避免代码重复。

　　（2）使用策略模式可以避免使用多重条件(if-else)语句。多重条件语句不易维护，它把采取哪一种算法或采取哪一种行为的逻辑与算法或行为的逻辑混合在一起，统统列在一个多重条件语句里面，比使用继承的办法还要原始和落后。

策略模式的缺点
　　（1）客户端必须知道所有的策略类，并自行决定使用哪一个策略类。这就意味着客户端必须理解这些算法的区别，以便适时选择恰当的算法类。换言之，策略模式只适用于客户端知道算法或行为的情况。
		(客户端必须知道所有的策略类，并自行决定使用哪一个策略类。)
		
　　（2）由于策略模式把每个具体的策略实现都单独封装成为类，如果备选的策略很多的话，那么对象的数目就会很可观。
        (造成很多的策略类)
        
        解决方案：采用工厂方法。

*/

public class StrategyTest {
	public static void main(String[] args) {
		
		//角色开始使用的是枪，攻击
		Knight role=new Knight(new Gun());
		role.performAttack();
		
		//现在要换成刀剑，攻击
		role.setWeapon(new Sword());
		role.performAttack();
		
		//现在要换成刀斧头，攻击
		role.setWeapon(new Axe());
		role.performAttack();
	}
}
