# M3U-reformat
<p>Reformats M3U files, stripping each line down to a filename. Ideal for playlists made in foobar2000 with files that may come from multiple folders.</p>
<p>From your media player, save the playlist as a file, and then drag the contents of the playlist into a new folder.</p>
<p>Name your exported playlist "in.m3u", run the program, and place "out.m3u" into the new folder.</p>
<p>As there is no simple solution to changing character encoding in Java, the input file must be encoded in UTF-8. There is an experimental script to convert Shift-JIS to UTF-8 included here, but for serious purposes use a text editor like VSCode, Notepad++, or Notepad to change the encoding appropriately.</p>
