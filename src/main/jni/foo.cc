#include "foo.h"

namespace FooLib {

void Foo::setMethod(int a)
{
	_a = a;
}


int Foo::getMethod(void)
{
	return _a;
}


Foo::Bool Foo::getBool(void) {
	return (_a != 0 ? TRUE : FALSE);
}


void Foo::getValues(struct Values& values) {
	values.x = _a;
	values.y = _a * 10;
}

void Foo::setVector(std::vector<int>& vect) {
	_a = vect[0];
	for (int i = 1 ; i < vect.size() ; i ++)
		_a += vect[i];
	_a /= vect.size();
}

	
} // namespace FooLib
