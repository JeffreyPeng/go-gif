#!/bin/sh

#ffmpeg -i $1 -vf scale='iw/1.5:ih/1.5' -r 10 $2
ffmpeg -i $1 -vf scale='iw/1:ih/1' -r 10 $2