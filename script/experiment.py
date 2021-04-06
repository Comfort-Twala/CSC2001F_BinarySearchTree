#!/usr/bin/python3
"""
Python script to:
    * Create a subset of n entries from sample data
    * Run both instrumented applications for every one of the n parameters corresponding to the subset of the data file.  Store all operation count values.
    * Determine the minimum (best case), maximum (worst case) and average of these count values. 
"""

### Imports
import os
import subprocess
import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import random


def main(app):
    """
    Main method to run expiriment.
    paramenter - App on which to run the experiment on.
    """
    pass

def create_subset(n):
    """
    Create a subset of n entries from sample data
    """
    sample_data = open_datafile()
    return random.sample(sample_data, n)

def count_values(count):
    """
    Add value of counter to dictionary
    """
    pass

def open_datafile():
    """
    opens datafile and returns a datalist (sample data) 
    """
    datalist = []
    with open('../data/oklist.txt', 'r') as data:
        for entry in data:
            datalist.append(entry)
        data.close()
    return datalist


if __name__ == "__main__":
    pass