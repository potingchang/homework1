import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author ken
 * @date 20180116 找出陣列中，最大與最小的數
 */
public class ChooseMaxMinNum {

	private static final int _num = 10;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = new int[_num];
		GetRandNumArray(arr);

		// 打印
		System.out.println("未經排序:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		int[] arrcopy = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arrcopy);
		System.out.println("");//换行
		System.out.println("\n排序：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arrcopy[i] + " ");
		}

		List<Integer> list = GetMaxNum(arr);
		System.out.println("");//换行
		System.out.println("\n找出最大与最小：");
		System.out.println("max= " + list.get(0));
		System.out.println("min= " + list.get(1));

	}

	/**
	 * 產生10個隨機整數，其值爲1～100
	 * 
	 * @param arr
	 * @return arr
	 */
	private static int[] GetRandNumArray(int arr[]) {
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100) + 1;
		}
		return arr;
	}

	/**
	 * 取最大和最小
	 * 
	 * @param arr
	 * @return list
	 */
	private static List<Integer> GetMaxNum(int arr[]) {
		LinkedList<Integer> list = new LinkedList<Integer>();

		if (null != arr) {
			int max = arr[0];// 先預設arr[0]是最大的
			int min = arr[0];// 先預設arr[0]是最小的

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}
				if (arr[i] < min) {
					min = arr[i];
				}

			}
			list.add(max);
			list.add(min);
			return list;
		}
		System.out.println("arr是空的");
		return null;
	}
}
