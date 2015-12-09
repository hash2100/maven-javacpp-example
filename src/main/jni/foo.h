#ifndef __FOO_H__
#define __FOO_H__

namespace FooLib {


struct Values {
	float x;
        float y;
};


class Foo {
protected:
	int _a;

public:
	enum Bool { TRUE, FALSE };

	void setMethod(int a);
	int getMethod(void);
	Bool getBool(void);
	void getValues(struct Values &values);
};

}

#endif // __FOO_H__
