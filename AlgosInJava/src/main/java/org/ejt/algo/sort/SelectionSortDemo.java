package org.ejt.algo.sort;

import java.util.Arrays;

/**
 * 
 * @Intent : To demonstrate selection sort technique.   
 *
 * @author : www.EasyJavaTutorials.in
 *
 *====================================================================== 
 *
 * Released under http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ====================================================================
 */
public class SelectionSortDemo {

    public static void main(String[] args) {
        int[] dataToSort = { 23, 32, 22, 53, 64, 26, 76, 23, 56 };

        for (int i = dataToSort.length - 1; i > 0; i--) {
            int largestValIndex = i;
            for (int j = i; j >= 0; j--) {
                if (dataToSort[j] > dataToSort[largestValIndex]) {
                    largestValIndex = j;
                }
            }
            // Swap largest element found with the last in array.
            int temp = dataToSort[i];
            dataToSort[i] = dataToSort[largestValIndex];
            dataToSort[largestValIndex] = temp;
        }
        System.out.println("Sorted Data list " + Arrays.toString(dataToSort));
    }
}