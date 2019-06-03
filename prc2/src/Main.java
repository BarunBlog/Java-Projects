import java.util.Queue;
import java.util.Scanner;


public class Main {

	public static int main(String[] args) {
		// TODO Auto-generated method stub

		*int n;
		int m;
		int a;
		int b;
		int i;
		int j;
		int x;
		int xx;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		vector<Integer>[] v = tangible.Arrays.initializeWithDefaultvectorInstances(1000);
		vector<Integer> order = new vector<Integer>();
		int[] deg = new int[n + 2];

		for (i = 0;i < m;i++)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			v[a].push_back(b);
			deg[b]++;
		}

		Queue<Integer> q = new Queue<Integer>();

		for (i = 1;i <= n;i++)
		{
			if (deg[i] == 0)
			{
				q.push(i);
			}
		}

		while (!q.empty())
		{

			x = q.front();
			q.pop();
			order.push_back(x);
			for (i = 0;i < v[x].size();i++)
			{
				xx = v[x][i];
				deg[xx]--;
				if (deg[xx] == 0)
				{
					q.push(xx);
				}
			}
		}
		if (order.size() != n)
		{
			System.out.print("NOT A DAG");
			return 0;
		}

		for (i = 0;i < order.size();i++)
		{
			System.out.print(order[i]);
			System.out.print("\n");
		}
		return 0;
	}

}
