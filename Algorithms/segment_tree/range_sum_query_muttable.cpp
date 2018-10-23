#include <bits/stdc++.h>

using namespace std;

class NumArray {
private:
    vector<int> st;
    int len, lenst;
    int constructST(vector<int> &nums, int low, int high, int si){
        if(low == high){
            st[si] = nums[low];
            return st[si];
        }
        int mid = low + (high-low)/2;
        st[si] = constructST(nums, low, mid, 2*si+1) + constructST(nums, mid+1, high, 2*si+2);
        return st[si];
    }
    int calSum(int low, int high, int i , int j, int si) {
        if(low >= i && high <= j ){
            return st[si];
        }
        if(low > j || high < i) {
            return 0;
        }
        else{
            int mid = low + (high - low)/2;
            return calSum(low, mid, i, j, (2*si+1)) + calSum(mid+1, high, i, j, (2*si+2));
        }
    }
    int makeUpdate(int i , int low, int high, int val, int si) {
        
        int mid = low + (high-low)/2;
        int re = 0;
        if(low == high) {
            
            re = st[si];
            st[si] = val;
            return re;
        }
        if(mid >= i){
            re = makeUpdate(i, low, mid, val, (2*si)+1);
            st[si] += val - re;
        }
        else if(mid < i) {
            re = makeUpdate(i, mid+1, high, val, (2*si)+2);
            st[si] += val - re;
        }
        
        return re;
    }
public:
    NumArray(vector<int> nums) {
        if(nums.empty()) {
            len = 0;
            return;
        }
        len = nums.size();
        lenst = ceil(log2(len));
        lenst = 2*pow(2,lenst)-1;
        st.resize(lenst, 0);
        constructST(nums, 0, len-1, 0);
    }
    
    void update(int i, int val) {
        if(!len) {
            return;
        }
        makeUpdate(i, 0, len-1, val, 0);
    }
    
    int sumRange(int i, int j) {
        if(!len)
            return 0;
        return calSum(0 , len-1, i , j, 0);
    }
};

int main() {
	vector <int> nums = {-28,-39,53,65,11,-56,-65,-39,-43,97};
	NumArray *obj = new NumArray(nums);
	int rt = obj->sumRange(3,6);
	cout << "Sum from index 3-6 inclusive = " << rt << endl;
	obj->update(3,7);
	rt = obj->sumRange(3,6);
	cout << "Sum from index 3-6 inclusive after update = " << rt << endl;
	return 0;
}






