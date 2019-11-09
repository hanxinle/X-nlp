# NLP相关资料\工具

### 工具1: hanlp

[HanLP](https://github.com/hankcs/HanLP)使用Java开发完成,安装后提供Python接口，兼容py22、py3。配套书籍[《自然语言处理入门》](http://nlp.hankcs.com/book.php),[随书代码](https://github.com/hankcs/pyhanlp/tree/master/tests/book).作者自我评价:内部算法经过工业界和学术界考验,欢迎查阅。

### 基本技术

字符 - 词 - 短语 - 句子 - 文档 ,一步步由零到整. hanlp配套书籍的概要:

* 分词
  * 切分算法
  * 字典树
  * AC自动机
  
  (上述算法的实施考虑更多考虑的是速度,为了提升正确率,引进机器学习算法)
  
在[机器学习实践](https://github.com/hanxinle/practical_machine_learning)中，提到模型评估的工具——混淆矩阵，实际上，由混淆矩阵能够得到以下几个模型评估的标准，分别是精确了率P、召回率R，F1 = 2*P*R /R+P，F1只有R、P都很高的时候才会很高。而每个数值都可以由混淆矩阵每个元素的值来计算得到。原来只关心准确率，即对角线元素数量处理元素总数，这是不严谨的。
  
  隐马尔科夫链
### 应用

* 文本聚类
* 文本分类
