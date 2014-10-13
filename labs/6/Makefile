RUN = src.AreaCalculator
SOURCE_DIR = src
BUILD_DIR = build

JAVA = java
J_FLAGS = -cp $(BUILD_DIR)
JAVAC = javac
JC_FLAGS = -d $(BUILD_DIR)

sources = $(wildcard $(SOURCE_DIR)/*.java)

.PHONY: default run clean

default: build $(sources:.java=.class)

%.class: %.java
	$(JAVAC) $(JC_FLAGS) $<

build:
	mkdir build

run: default
	$(JAVA) $(J_FLAGS) $(RUN)

clean:
	$(RM) -r $(BUILD_DIR)
