class Pool:
    total_value = 0


    def __init__(self, name='default', type='default', color='default', manufacturer='default', value=0):
        self.name = name
        self.type = type
        self.color = color
        self.manufacturer = manufacturer
        self.value = value
        Pool.total_value += value

    def to_string(self):
        print('Name: %s  \nType: %s \nColor: %s \nManufacturer: %s \nValue: %s' % (
        self.name, self.type, self.color, self.manufacturer, self.value))

    def print_sum(self):
        print("Value of " + self.manufacturer + "'s pools: ", self.value, "grn")


def print_static_sum():
    print('Total value: {0} grn'.format(Pool.total_value))


if __name__ == '__main__':
    pool0 = Pool()
    pool1 = Pool('Seaway', 'Skeletal', 'Yellow', 'Pupe', 15600)
    pool2 = Pool('DeepGape', 'Inflanatable', 'Red','Gad', 3155)
    pool3 = Pool('Gaster', 'Skeletal', 'Purple', 'Merek', 10000)
    pool4 = Pool('Miller ', 'Inflanatable', 'Blue','Odin', 25555)

pool0.to_string
print("\n")
pool1.to_string()
print("\n")
pool2.to_string()
print("\n")
pool3.to_string()
print("\n")
pool4.to_string()
print("\n\n")
pool1.print_sum()
pool2.print_sum()
pool3.print_sum()
pool4.print_sum()
Poolcontent = print_static_sum()