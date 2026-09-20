/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    let left = 0;
    let right = height.length - 1;
    let max = 0;

    while (left < right) {
        const area = Math.min(height[left], height[right]) * (right - left);
        max = Math.max(max, area);

        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }

    return max;
};


/*
0-define max = minimum value "0" , get the length of array
1-we loop throw the array 'nested loop'
    1.1-take the element and loop to the nexts one by one  if  the element is 0 we contine
    1.2- calculate the max ' get the lowest number and add power 2'
    1.3 compare it with the max and assign the biggest one to the max
 2-return the max






*/
