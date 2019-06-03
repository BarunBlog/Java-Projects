
public class Car {
	static int price;
	void show()
	{
		Engine ob = new Engine();
		ob.start("Gari jure chala");
		ob.stop();
		ob.run();
		ob.show1();
	}
	class Engine{
		void show1()
		{
			parts obj = new parts();
			obj.gan();
		}
		void start(String str)
		{
			System.out.println(str);
		}
		void stop()
		{
			System.out.println("Break");
		}
		void run()
		{
			System.out.println("Run");
		}
		class parts{
			void gan()
			{
				System.out.println("Gari chole na, chole na,chole na re");
			}
		}
	}
	
}
