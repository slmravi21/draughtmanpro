prices = {'tv': 130, 'sofa': 120, 'Dining': 40}

for items in prices:
    print('Price of ' + format(items) + ' is ' + format(prices[items]))

print(prices)
del prices['Dining']
print(prices)

if 'Dining' not in prices.keys():
    print('Dining is deleted')
else:
    print('Dining is present')

print(prices)

for item, price in prices.items():
    print('Price of {0} is {1}'.format(item, price))

newjson = {"widget": {
    "debug": "on",
    "window": {
        "title": "Sample Konfabulator Widget",
        "name": "main_window",
        "width": 500,
        "height": 500
    },
    "image": {
        "src": "Images/Sun.png",
        "name": "sun1",
        "hOffset": 250,
        "vOffset": 250,
        "alignment": "center"
    },
    "text": {
        "data": "Click Here",
        "size": 36,
        "style": "bold",
        "name": "text1",
        "hOffset": 250,
        "vOffset": 100,
        "alignment": "center",
        "onMouseUp": "sun1.opacity = (sun1.opacity / 100) * 90;"
    }
}}

print('================JSON=================')
print(newjson["widget"]["debug"])
print(newjson["widget"]["window"]['title'])
print(len(newjson))

print('before changes=================')
print(newjson)

del newjson['widget']["image"]["alignment"]
print('after changes=================')
print(format(newjson))
