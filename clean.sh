#!/bin/sh

# delete files before 2 days
find ./tmp -mtime +1 -delete
