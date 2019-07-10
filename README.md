# hw2ForAndroidCamp
 3170105468-武靖超-安卓开发作业2
# hw2工作概要：

本次总体来说在hw1的基础上修改，首先将hw1的buttonGame修改成了一个子activity，而新建一个按钮清单的新MainActivity。按下两个按钮，可以分别跳到不同的工作下，其中“RECYCLERVIEW”（以下简称rv）为本次的主要工作。

本次实现了一个基础的rv，可以显示“index”、“title”、“hot”、“new”、“recommend”几个项。具体实现按照数据和样式两方面来说：

- 数据方面：每个项的数据存储在一个Data类中，index和title作为string，其余作为boolean。在后续的bind阶段，将已有数据（本次按照遍历range(30)以及一些取模操作来生成）绑定在ListViewHolder中对应的位置上，并通过setxxx操作来实际安置（hot等对应的是）。
- 样式方面：主要在于一个项(item_list文件中）如何排布。这里按照纵向的线性布局（一行）嵌套横向的（多列）来实现，具体来说每一行中，按照weight 1:10:1:1:1来分配各个数据的显示。注意，hot，new，recommend其实相当于默认不显示，只有在数据中boolean为true时才写入文字，实现了占位的同时自由控制hidden。此外参照网络，添加了每一项的边框，设置了一个shape作为每一项的linearlayout的background来实现。