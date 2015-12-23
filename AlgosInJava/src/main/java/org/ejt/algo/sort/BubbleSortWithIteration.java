package org.ejt.algo.sort;

import java.util.Arrays;

/**
 * 
 * @Intent : Demonstrates working of Bubble Sort Algorithm.
 * 			 Also captures how many iteration does it take to complete sorting.
 * 
 * @PesudoCode
 * 
 *             For index between 0 and (array to sort length - 2) if
 *             (array[index +1] < array [i]) switch array[ i ] and array [index
 *             +1] mark switched to be true.
 * 
 *             Keep repeating until a iteration is completed without any array
 *             element switched.
 *
 * @author : www.EasyJavaTutorials.in
 *
 *         ====================================================================
 *         ==
 *
 *         Released under http://www.apache.org/licenses/LICENSE-2.0 Unless
 *         required by applicable law or agreed to in writing, software
 *         distributed under the License is distributed on an "AS IS" BASIS,
 *         WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *         implied. See the License for the specific language governing
 *         permissions and limitations under the License.
 *         ====================================================================
 */
public class BubbleSortWithIteration {

	private static int[] arrayToSort = { 2, 3, 12, 4, 8, 7 };

	public static void main(String[] args) {
		System.out.println("Array Before Sorting "+Arrays.toString(arrayToSort));
		int iterations = bubbleSort(arrayToSort); //Sort Array
		System.out.println("Array After bubble sorting "+Arrays.toString(arrayToSort));
		System.out.println("Total iterations for sorting [" +iterations+"]");
	}

	public static int bubbleSort(int[] arrayToSort) {
		boolean numberSwapped;
		int temp; //used to store array values temporarily while sorting.
		int iterations=0; // 
		do {
			numberSwapped = false;
			iterations++; //
			for(int i=0; i<arrayToSort.length-1;i++) {
				if(arrayToSort[i] > arrayToSort[i+1]) {
					temp = arrayToSort[i+1];
					arrayToSort[i+1] = arrayToSort[i];
					arrayToSort[i] = temp;
					numberSwapped = true;
				}
			}
		}while(numberSwapped);
		return iterations;
	}
}
