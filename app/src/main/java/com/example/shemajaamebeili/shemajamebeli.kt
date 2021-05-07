package com.example.shemajaamebeili
import java.util.*



class shemajamebeli {

    fun unique(nums: Array<Int>): Int {

        val ricxvebi = nums.toSet()
        var arrLength = ricxvebi.count()



        return arrLength


    }


    fun tanakveta(nums1: Array<Int>, nums2: Array<Int>): IntArray {


        //1


        //3
        val iArray = nums1.intersect(nums2.toList()).toIntArray()

        //4
        return iArray

    }

    fun gaertianeba(nums1: Array<Int>, nums2: Array<Int>): Array<Int> {


        //1


        //3
        val iArray = (nums1+nums2).toSet()
        var finArray= iArray.toTypedArray()

        //4
        return finArray
    }

    fun sashualo(nums: Array<Int>): Array<Int> {

        val finArray = arrayOf<Int>()
        var arrLength = nums.count()


        var avg = nums.average()


        val list: MutableList<Int> = finArray.toMutableList()


        nums.forEach {
            if (it < avg) {

                list.add(it)

            }
        }
        return list.toTypedArray()
    }




    fun maximumi(nums: Array<Int>): Unit {

        val finArray = arrayOf<Int>()
        var arrLength = nums.count()


        var max = nums.maxOrNull()
        var maxIndex = nums.indexOf(max)


        val arraytwo = nums.toMutableList()
        arraytwo.removeAt(maxIndex)

        println("meore maqsimumi aris " + arraytwo.maxOrNull())

        var min = nums.minOrNull()
        var minIndex = nums.indexOf(min)

        val arrayThree = nums.toMutableList()
        arrayThree.removeAt(minIndex)

        println("meore minimumi aris " + arrayThree.minOrNull())




    }


    fun main(args: Array<String>) {

        val numbers = arrayOf(1, 2, 3, 4, 4)
        println(unique(numbers))



        val firstArray = arrayOf(1, 2, 3, 4, 5)
        val secondArray = arrayOf(2, 5, 6, 7)

        println(Arrays.toString(tanakveta(firstArray, secondArray)))
        println(Arrays.toString(gaertianeba(firstArray, secondArray)))
        println(Arrays.toString(sashualo(firstArray)))
        println(maximumi(firstArray))


    }


}


