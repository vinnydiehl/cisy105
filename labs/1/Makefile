RUN = FeetToInches
BUILD_DIR = build

JAVA = java
J_FLAGS = -cp $(BUILD_DIR)
JAVAC = javac
JC_FLAGS = -d $(BUILD_DIR)

sources = $(wildcard *.java)

.PHONY: default build_dir compile run clean

default: build_dir compile

%.class: %.java
	$(JAVAC) $(JC_FLAGS) $<

build_dir:
	mkdir -p build

compile: $(sources:.java=.class)

run: default
	$(JAVA) $(J_FLAGS) $(RUN)

clean:
	$(RM) -r $(BUILD_DIR)
