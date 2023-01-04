#!\usr\bin\env python3.5
# -*- coding: utf-8 -*-
import os.path,zipfile
import shutil
import subprocess

#执行命令
# git log --name-only

base_dir = 'D:\java\mpf-scm-product'
new_base_dir = r'D:\java\zhang'

def make_zip(source_dir, output_filename):
    zipf = zipfile.ZipFile(output_filename, 'w')
    pre_len = len(os.path.dirname(source_dir))
    for parent, dirnames, filenames in os.walk(source_dir):
        for filename in filenames:
            pathfile = os.path.join(parent, filename)
            arcname = pathfile[pre_len:].strip(os.path.sep)     #相对路径
            zipf.write(pathfile, arcname)
    zipf.close()


def copyOs(file):
    full_path = os.path.join(base_dir,file)
    is_dir = os.path.isdir(file)
    newfile = os.path.join(new_base_dir,file)
    new_dir  =os.path.dirname(newfile)
    print(new_dir)
    try:
        print('mkdir '+ '' + new_dir)
        out_bytes = subprocess.check_output('mkdir '+ '' + new_dir, shell=True)
    except:
        print('error')
    shutil.copyfile(full_path,newfile)



copyOs(r'mpf-scm-product-client\src\main\java\com\sqqmall\facade\ISupplierClient.java')
copyOs(r'mpf-scm-product-server\src\main\java\com\sqqmall\bean\entity\SupplierEntity.java')
copyOs(r'mpf-scm-product-server\src\main\java\com\sqqmall\dao\SupplierMapper.java')
copyOs(r'mpf-scm-product-server\src\main\java\com\sqqmall\service\SupplierService.java')
copyOs(r'mpf-scm-product-server\src\main\java\com\sqqmall\service\impl\SupplierServiceImpl.java')
copyOs(r'mpf-scm-product-server\src\main\java\com\sqqmall\service\rpc\feign\SupplierFeign.java')



# C:\ProgramData\Anaconda3\envs\image\python.exe moveFile.py


