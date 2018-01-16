import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author ken
 * @date 20180116 找出陣列中，第一大的數與第二大的數
 */
public class chooseFirstAndSecondNum {
	private static final int _num = 10;

	public static void main(String[] args) {
		int[] arr = new int[_num];
		GetRandNumArray(arr);
		System.out.println("未經排序:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		int[] arrcopy = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arrcopy);
		System.out.println("");//换行
		System.out.println("\n排序:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arrcopy[i] + " ");
		}

		List<Integer> list = GetMaxNum(arr);
		System.out.println("");//换行
		System.out.println("\n找出陣列中，第一大的數與第二大的數：");
		System.out.println("max=" + list.get(0));
		System.out.println("max_second=" + list.get(1));

	}

	/**
	 * 產生10個隨機整數，其值爲1～100
	 * 
	 * @param arr
	 * @return arr
	 */
	private static void GetRandNumArray(int arr[]) {
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100) + 1;
		}
	}

	/**
	 * 取第一個大的數 以及 第二個大的數
	 * 
	 * @param arr
	 * @return list
	 */
	private static List<Integer> GetMaxNum(int arr[]) {
		LinkedList<Integer> list = new LinkedList<Integer>();

		if (null != arr) {
			// int middle = arr[0];
			int max = arr[0];
			int max_second = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > max) {
					max_second = max;
					max = arr[i];
				}
				if (arr[i] < max && arr[i] > max_second) {
					max_second = arr[i];
				}
			}
			list.add(max);
			list.add(max_second);
			return list;
		}
		System.out.println("arr是空的");
		return null;
	}

}
