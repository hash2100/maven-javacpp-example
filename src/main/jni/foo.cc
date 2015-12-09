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

} // namespace FooLib
