package org.ejt.algo.sort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * 
 * @Intent : Demonstrates how quick sort algorithm works.
 *
 * @PesudoCode : First of all create a new list size equivalent to the list
 *             which has to be sorted. (Note. List automatically grows so no
 *             worry if using list). For each element unsortedList element
 *             unsortedNumber for i =0 to sortedList length if(unsortedNumber <
 *             sortedList[i]) insert unsortedNumber at i index else move to next
 *             element.
 * 
 *             if unsortedNumber is not inserted till end of loop append
 *             unsortedNumber to the end of sortedList
 * 
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
public class QuickSort {
	private static final int[] unsortedList = { 95, 2, 23, 29, 54, 78 };

	public static void main(String[] args) {
		System.out.println("Array Before Sorting "+Arrays.toString(unsortedList));
		List<Integer> sortedList = quickSort(unsortedList); //Sort Array
		System.out.println("Array After Insertion Sort "+sortedList);
	}

	public static List<Integer> quickSort(int[] unsortedList) {
		List<Integer> sortedList = new LinkedList<Integer>();
		boolean numberAdded;
		for (int unsortedNumber : unsortedList) {
			numberAdded = false;
			for (int i = 0; i < sortedList.size(); i++) {
				if (unsortedNumber < sortedList.get(i)) {
					sortedList.add(i, unsortedNumber);
					numberAdded = true;
					break;
				}
			}
			if (!numberAdded) {
				sortedList.add(unsortedNumber);
			}
		}
		return sortedList;
	}
}
