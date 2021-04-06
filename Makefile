# Assignment 1 program makefile
# Comfort Twala

JAVA=/usr/bin/java
JAVAC=/usr/bin/javac
JAVADOC=/usr/bin/javadoc
.SUFFIXES: .java .class
SRCDIR=src
BINDIR=bin
DOCDIR=doc

$(BINDIR)/%.class:$(SRCDIR)/%.java
		$(JAVAC) -d $(BINDIR)/ -cp $(BINDIR) $<

CLASSES=BinaryTreeNode.class BTQueueNode.class BTQueue.class BinaryTree.class BinarySearchTree.class BinarySearchTreeTest.class Student.class fileHandler.class ArrayApp.class BSTApp.class AccessArrayApp.class AccessBSTApp.class

CLASS_FILES=$(CLASSES:%.class=$(BINDIR)/%.class)

default: $(CLASS_FILES)

clean:
		$(RM) $(BINDIR)/*.class

runArray: $(CLASS_FILES)
		$(JAVA) -cp $(BINDIR) AccessArrayApp $(ID)

runBST: $(CLASS_FILES)
		$(JAVA) -cp $(BINDIR) AccessBSTApp $(ID)

docs:
		$(JAVADOC) -d $(DOCDIR) $(SRCDIR)/*

cleanDocs:
		rm -r $(DOCDIR)/*