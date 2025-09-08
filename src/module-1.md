# Module 1

## Example

![alt text](image.png)

Here $V=\{1\}$. Read the $4\times4$ subsets:

**S1**

$$
\begin{matrix}
0&0&0&0\\
0&0&1&0\\
0&0&1&0\\
0&1&1&1
\end{matrix}
$$

**S2**

$$
\begin{matrix}
0&0&1&1\\
0&1&0&0\\
1&1&0&0\\
0&0&1&1
\end{matrix}
$$

### Number of connected components

**S1**

* **4-connected:** **1 component.**
  Reason: (2,3) is 4-adjacent to (3,3); (3,3) is 4-adjacent to (4,3); (4,3) is 4-adjacent to both (4,2) and (4,4). So every 1 is reachable by a chain of up/down/left/right steps.
* **8-connected:** **1 component.** (Including diagonals doesn't split anything further.)
* **m-connected:** **1 component.** (No diagonal-only isolated pairs to treat specially.)

**S2**

* **4-connected:** **3 components.**
  The three 4-connected groups are:

  1. {(1,3), (1,4)} — top row pair (horizontal).
  2. {(2,2), (3,2), (3,1)} — middle-left cluster (vertical + horizontal links).
  3. {(4,3), (4,4)} — bottom row pair.
* **8-connected:** **1 component.**
  Diagonal links connect those three groups into one (e.g. (1,3) is diagonal to (2,2), (3,2) is diagonal/adjacent to (4,3), etc.).
* **m-connected:** **1 component.**
  Each diagonal connection that joins components is allowed under the m-rule because the intersection of the two pixels’ 4-neighborhoods contains **no** 1’s (so no conflict). Example: (1,3) (top row) and (2,2) (middle-left) are diagonal; their $N_4$ intersection is {(1,2),(2,3)} which are both 0, so the diagonal is allowed.

### Are $S_1$ and $S_2$ adjacent?

Assume the two 4×4 blocks are placed side-by-side (S2 immediately to the right of S1).

* **4-adjacent:** **No.**
  There is no pair of 1s that are directly horizontal/vertical neighbors across the boundary (no S1(r,4)=1 and S2(r,1)=1 for the same row).
* **8-adjacent:** **Yes.**
  Example: S1’s (4,4) (bottom-right corner of S1) and S2’s (3,1) (third row, first column of S2) are diagonally adjacent in the combined image: their coordinates in the full image differ by (−1,+1).
* **m-adjacent:** **Yes.**
  For the diagonal pair above, check the m-rule: the intersection $N_4(\text{S1(4,4)})\cap N_4(\text{S2(3,1)})$ = {(3,4),(4,5)} (in the combined grid) — both of those pixels are 0, so the diagonal is allowed under m-adjacency. Thus S1 and S2 are also **m-adjacent**.
  
---
