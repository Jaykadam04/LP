// #FirstFit.java
import java.util.*;
 public class FirstFit {
 public static void firstFitAlgo(int blocks[], int m, int processes[], int n) {
 int allocation[] = new int[n];
 for (int i = 0; i < n; i++) {
 allocation[i] =-1;
 }
 for (int i = 0; i < n; i++) {
 for (int j = 0; j < m; j++) {
 if (blocks[j] >= processes[i]) {
 allocation[i] = j;
 blocks[j] = blocks[j]- processes[i];
 break;
 }
 }
 }
 System.out.println("\nProcess No.\tProcess Size\tBlock no.");
 for (int i = 0; i < processes.length; i++) {
 System.out.print(" " + (i + 1) + "\t\t" + processes[i] + "\t\t");
 if (allocation[i] !=-1)
 System.out.print(allocation[i] + 1);
 else
 System.out.print("Not Allocated");
 System.out.println();
 }
 }
 public static void main(String[] args) {
 int blocks[]={100,500,600,200,400};
 int processes[]={245,756,111,235};
 firstFitAlgo(blocks, blocks.length, processes, processes.length);
 }
 }
//  Output:
//  #BestFit.java
 public class BestFit {
 public static void BestAlgo(int processes[], int m, int blocks[], int n) {
int allocation[] = new int[m];
 for (int i = 0; i < m; i++) {
 allocation[i] =-1;
 }
 for (int i = 0; i < m; i++) {
 int bestIdx =-1;
 for (int j = 0; j < n; j++) {
 if (blocks[j] >= processes[i]) {
 if (bestIdx ==-1) {
 bestIdx = j;
 } else if (blocks[bestIdx] > blocks[j]) {
 bestIdx = j;
 }
 }
 }
 if (bestIdx !=-1) {
 allocation[i] = bestIdx;
 blocks[bestIdx]-= processes[i];
 }
 }
 System.out.println("\nProcess No.\tProcess Size\tBlock no.");
 for (int i = 0; i < n; i++) {
 System.out.print(" " + (i + 1) + "\t\t" + processes[i] + "\t\t");
 if (allocation[i] !=-1)
 System.out.print(allocation[i] + 1);
 else
 System.out.print("Not Allocated");
 System.out.println();
 }
 }
 public static void main(String[] args) {
 int blocks[] = {100, 500, 200, 300, 600};
 int processes[] = {212, 417, 112, 426};
 int m = blocks.length;
 int n = processes.length;
 BestAlgo (blocks, m, processes, n);
 }
 };
//  Output:
// #WorstFit.java
 public class WorstFit {
 public static void WorstAlgo(int processes[], int m, int blocks[], int n) {
 int allocation[] = new int[m];
 for (int i = 0; i < m; i++) {
 allocation[i] =-1;
 }
 for (int i = 0; i < m; i++) {
 int worstIdx =-1;
 for (int j = 0; j < n; j++) {
 if (blocks[j] >= processes[i]) {
 if (worstIdx ==-1) {
 worstIdx = j;
 } else if (blocks[worstIdx] < blocks[j]) {
 worstIdx = j;
 }
 }
 }
 if (worstIdx !=-1) {
 allocation[i] = worstIdx;
 blocks[worstIdx]-= processes[i];
 }
 }
 System.out.println("\nProcess No.\tProcess Size\tBlock no.");
 for (int i = 0; i < n; i++) {
 System.out.print(" " + (i + 1) + "\t\t" + processes[i] + "\t\t");
 if (allocation[i] !=-1)
 System.out.print(allocation[i] + 1);
 else
 System.out.print("Not Allocated");
 System.out.println();
 }
 }


public class GFG {

	static void NextFit(int blockSize[], int m, int processSize[], int n) {
		int allocation[] = new int[n], j = 0, t = m - 1;
		Arrays.fill(allocation, -1);

		for(int i = 0; i < n; i++) {
			while (j < m) {
				if(blockSize[j] >= processSize[i]) {
					allocation[i] = j;
					blockSize[j] -= processSize[i];
					t = (j - 1) % m;
					break;
				}
				if (t == j) {
					t = (j - 1) % m;
					break;
				}
				j = (j + 1) % m;
			}
		}

		System.out.print("\nProcess No.\tProcess Size\tBlock no.\n");
		for (int i = 0; i < n; i++) {
			System.out.print(i + 1 + "\t\t\t\t" + processSize[i] + "\t\t\t\t");
			if (allocation[i] != -1) {
				System.out.print(allocation[i] + 1);
			} else {
				System.out.print("Not Allocated");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		int blockSize[] = {5, 10, 20};
		int processSize[] = {10, 20, 5};
		int m = blockSize.length;
		int n = processSize.length;
		NextFit(blockSize, m, processSize, n);
	}
}

 public static void main(String[] args) {
 int blocks[] = {100, 500, 200, 300, 600};
 int processes[] = {212, 417, 112, 426};
 int m = blocks.length;
 int n = processes.length;
 WorstAlgo (blocks, m, processes, n);
 }
 };