all: libfoo.so
	mkdir -p ../../../target/classes/eu/atspace/hash/linux-x86_64
	cp libfoo.so ../../../target/classes/eu/atspace/hash/linux-x86_64

clean:
	rm -f *.o *.so

libfoo.so: foo.o
	g++ -shared -o libfoo.so foo.o

foo.o: foo.cc foo.h
	g++ -c -fPIC foo.cc

