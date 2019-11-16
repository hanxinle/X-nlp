# NLP相关资料\工具

### NLP概述

[这篇博文](https://github.com/hanxinle/nlp/blob/master/nlp_start.md)是对<自然语言处理入门>总结，将NLP涉及的概念、操作进行了阐述，本书在深度学习技术在NLP领域的应用方面着墨不多，这部分还需要找不错的综述文章来读。

### NLP 所需要的技能

* 词向量技术
   
   one-hot,词袋,word2vec,fasttext,glove,elmo....,它是当前NLP任务开战的重要步骤,直接影响后续操作的结果.

* 序列问题

    分词,词性标注,命名实体识别,依存句法分析
    
* 机器学习算法

    逻辑回归,SVM,决策树,boost,K-means,crf,朴素贝叶斯
    
* 深度学习算法

    CNN,RNN,LSTM,attention,transformer,gpt,bert等.
    
* 其它技术

    基于机器学习的预处理,ML技术与NLP的交叉,如基于深度学习的端到端,关键提取.
    
* 知识图谱



### 工具1:spacy,nltk，tensorflow
   
   前二者时最流行的两个NLP通用工具，当需要使用深度学习技术执行相关NLP任务时，我选择tensorflow.
   
### 工具2: hanlp

[HanLP](https://github.com/hankcs/HanLP)使用Java开发完成,安装后提供Python接口，兼容py22、py3。配套书籍[《自然语言处理入门》](http://nlp.hankcs.com/book.php)，[随书代码](https://github.com/hankcs/pyhanlp/tree/master/tests/book).作者自我评价:内部算法经过工业界和学术界考验,欢迎查阅。

### hanlp书籍内容
  
在模型评估中,涉及到混淆矩阵和以下3个指标.
 
在[机器学习实践](https://github.com/hanxinle/practical_machine_learning)中，提到模型评估的工具——混淆矩阵，实际上，由混淆矩阵能够得到以下几个模型评估的标准，分别是精确了率P、召回率R，F1 = 2*P*R /R+P，F1只有R、P都很高的时候才会很高。而每个数值都可以由混淆矩阵每个元素的值来计算得到。原来只关心准确率，即对角线元素数量处理元素总数，这是不严谨的。
  
