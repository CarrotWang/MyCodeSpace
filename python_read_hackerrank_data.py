#coding:utf-8
import numpy as np
#Data = open('House_prices.txt')
#print Data.readlines()
# for line in Data:
	# line = line.rstrip('\n')   #ȥ���ı��еġ�\n��
	# print line
arr = np.loadtxt('House_prices.txt',delimiter=' ')
print arr